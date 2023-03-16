package stackViaArray;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    //Constructor khởi tạo mảng dữ liệu với kích thước cho trước
    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    //Khởi tạo phương thức kiểm tra trạng thái đầy của mảng thông qua biến đếm index
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    //Khởi tạo phương thức kiểm tra trạng thái trống của mảng thông qua biến đếm index
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    //Phương thức "push" để thêm phần tử vào cuối mảng
    //Kiểm trang trạng thái đầy của mảng => đưa ra thông báo, hoặc thực thi
    //Nếu thoả mãn thì đẩy phần tử vào cuối mảng, cập nhật kích thước thực
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    //Phương thức "pop" để xoá phần tử khỏi cuối mảng
    //Kiểm trang trạng thái trống của mảng => đưa ra thông báo, hoặc thực thi
    //Nếu thoả mãn thì xoá phần tử khỏi cuối mảng, cập nhật kích thước thực
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    //Phương thức nhận kích thước thực của mảng
    public int size() {
        return index;
    }
}
