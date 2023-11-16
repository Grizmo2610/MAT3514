# Homework 7: Searching and Binary Search Trees

#### Exercise 01: 
> Ở bai này test được đặt trong lớp `Search.java` 
 
Phương thức `test()` nhận vào 3 tham số là:
+ `type` để lựa chọn kiểu dữ liệu thực hiện kiểm thử (ArraList, LinkedList và SortedLinkedList).
+ `size` kích thước của mảng muốn test
+ `bound` giới hạn trên của các phần tử trong mảng

Các lớp được viết lại để khi gửi sẽ không bị lỗi. Thực hiện tìm kiếm qua 2 phương thức:
+ `isContain()`: trả vể true nếu tồn tại số trong mảng và ngược lại
+ `indexOf()`: trả về vị trí của số trong mảng. nếu không tìm được, trả về -1


#### Exercise 02:
> Lớp test cây được đặt tại lớp `Main.java` lớp tính thời gian chạy được đặt tại `Statistics.java`

Trong bài này do số lượng yêu cầu kích thước tối thiểu là 10 ^ 6 nên việc nhập chay các sổ là quá bất tiện nên phương thức `randomTree` sẽ dùng để tạo ngẫu nhiên chương trình
Sau khi đã có một cây ngẫu nhiên, tiến hành tim kiếm trên cây. Phương thức `test()` có tham số `boolean displayTree` được mặc định truyền vào là là false. nếu tham số này là true thì sau khi tạo cây xongsex in ra màn hình để người dùng xem.
Tuy nhiên không khuyến khích việc hiển thị vì sẽ khiến cho việc chờ đợi tìm kiếm lâu hơn (Do phải duyệt cây sau đó trả về kết quả).
Các phương thức khác nâng cao hơn trong giờ lý thuyết được đưa vào trong lớp `AdvanceBST.java`

> Lưu ý: Với trường hợp size = 10 ^ 8 chương trình bị tràn bộ nhớ (OutOfMemoryError)

Để chạy được với trường hợp 10 ^ 8 trở lên, cần config lại VM Options hoặc chạy trong terminal
java -Xmx4g Statistics