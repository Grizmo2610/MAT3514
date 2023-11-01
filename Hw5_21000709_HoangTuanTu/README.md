# Lab 05: Tree

### Combo 1
#### exercise01: 
Trong 2 lớp ```ArrayBinaryTree.java``` và lóp ```LinkedBinaryTree``` đã có đầy đủ giải thích về các phương thức trong lớp

Tóm tắt ý tưởng:
1. Array

Với array được lưu trữ thì phần tử con bên trái của 1 phần tử sẽ có index = p * 2 + 1 và phần tử con bên phải có index = p * 2 + 2.

Khi add chúng ta sẽ truyền vào địa chỉ (index) của node node sẽ add trái, add phải tùy theo yêu cầu.

Khi gọi parent chương trình sẽ tìm đến vị trí parent của node. Riêng trường hợp của node = 0 (Gốc) thì sẽ không tồn tại parent nên sẽ ném ngoại lệ

2. Linked
Tương tự với array, khi gọi đến các hàm add, chương trình sẽ truy vấn và add dữ liệu. Nếu tại đó đã có thì sẽ ném ngoại lệ

Ngoài ra sẽ có phương thức khởi tạo ngẫu nhiên. Dữ liệu truyền vào sẽ là chiều cao của cây, Chương trình sẽ tạo node, sau đó sẽ gán giá trị cho trái sau đấy gọi đệ quy cho node bên trái (Mỗi lần gọi `size` sẽ giảm xuống). Sau đó gán cho bên phải và gọi đệ quy phải.

Sau khi kết thúc ta sẽ thu được một cây đầy đủ với chiều cao là `size`

#### exercise02:

