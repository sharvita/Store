import java.util.Iterator;
import java.util.function.Consumer;

class ItemIterator implements Iterator<Item>
{
    public Item current;
    private int currentIndex;
    private ItemList itemList;

    public ItemIterator(ItemList item_List) {
        this.itemList = item_List;
        this.currentIndex = 0;
        this.current = itemList.getItems()[0];
    }

    @Override
    public boolean hasNext() {
        return itemList.getItems()[currentIndex + 1] != null;
    }

    @Override
    public Item next() {
        this.currentIndex++;
        return itemList.getItems()[currentIndex];
    }

    @Override
    public void remove() {
        current = null;
        forEachRemaining(x -> shiftLeft());
    }

    @Override
    public void forEachRemaining(Consumer<? super Item> action) {
        while (hasNext())
        {
            action.accept(next());
        }
        current = null;
    }

    public void shiftLeft()
    {
        itemList.getItems()[currentIndex - 1] = itemList.getItems()[currentIndex];
    }
}


