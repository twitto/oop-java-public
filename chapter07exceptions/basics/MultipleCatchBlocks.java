package chapter07exceptions.basics;

class MultipleCatchBlocks
{
    public int[] arr = new int[10];

    public void writeList()
    {
        try {
            arr[10] = 11;
        } catch (NumberFormatException e1) {
            System.out.println("NumberFormatException => " + e1.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
        }
    }

    public static void main(String[] args)
    {
        MultipleCatchBlocks list = new MultipleCatchBlocks();
        list.writeList();
    }
}


