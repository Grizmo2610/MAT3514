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

> Lưu ý: Với trường hợp size = 10^8 chương trình bị tràn bộ nhớ (OutOfMemoryError)

Để chạy được với trường hợp 10^8 trở lên, cần config lại VM Options hoặc chạy trong terminal
java -Xmx4g Statistics hoặc liên hệ thông qua zalo: 0379061825 để được hỗ trợ chạy chương trình >= 10 ^ 8
Yêu cầu cấu hình: 
+ Với test case <= 5 * 10 ^ 7: Tối thiểu 8GB Ram với trường hợp không rõ cách config hoặc config sai hoặc 4GB Ram Với trường hợp config được memory
+ Với test case > 5 * 10 ^ 7: Tối thiểu 16GB Ram với trường hợp không rõ cách config hoặc config sai hoặc 4GB Ram với trường hợp config memory
> Cần lưu ý rằng với trường hợp tree node càng lớn, càng cấn phải cấp phát nhiều hơn, và không khuyến khích sử dụng size quá lớn vì thời gian để tạo cây rất lâu và rất tốn bộ nhớ có thể gây ra vấn đề với máy tính.

_Lớp đặc biệt: _
+ Lớp `TestMemory.java`: Hiển thị các thông số của máy tính
+ Lớp `MostMermory.java`: (**Không khuyến khích chạy lớp này**) Lớp này ngoài lề cho các máy thần tiên chơi. Kiểm tra xem máy có thể chạy được quá khỏi mức máy bình thường không. Cần lưu ý trước là chương trình sẽ tốn gần như toàn bộ Ram để chạy chương trình nên hãy cân nhắc trong việc chạy chương trình này.

Chương trình được import thêm thư viện `java.text.NumberFormat` để format kích thước (số) cho dễ nhìn.
> Ngoài các cách ddeer config memory size có thể sử dụng github codespace để tăng tốc độ và khả năng chạy chương trình
#### Exercise 03: 

#### Exercise 04:

#### Practice 01:
**Ý tưởng:** Do nếu một mảng là một dãy duyệt giữa của một cây tìm kiếm nhị phân thì chắc chắn mảng này phải là một mảng đã sắp xếp theo thứ tự tăng dần.
Vì thế chỉ cần duyệt mảng từ i -> n-1 nếu như tồn tại một phần từ a[i] > a[i + 1] hay nói cách khác là tồn tại một phần tử lớn hơn đứng trước thì lập tức trả về false

#### Practice 02:
**Ý tưởng:** kiểm tra xem ở các cây con có phải là cây tìm kiếm nhị phân hay không. Sau đấy gọi đệ quy

#### Practice 04:
**Ý tưởng:** Tạo biến đếm, thực hiện phép duyệt (Ở đây sử dụng duyệt giữa) sau đấy so sánh giá trị, nếu trong khoảng thì tăng lên nếu không thì dừng lại;
#### Practice 07:

#### Practice 13:
**Ý tưởng:** Thực hiện tương tự việc thêm node vào cây với node gốc là phần tử cuối cùng.
Sau khi đã có gốc chúng ta duyệt ngược mảng và insert lần lượt sau đấy trả về nút gốc ta sẽ có cây tìm kiếm nhị phân.