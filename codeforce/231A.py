# def solve():
#     n = int(input())  # Số lượng bài toán
#     count = 0         # Đếm số bài toán sẽ được giải
    
#     for _ in range(n):
#         a, b, c = map(int, input().split())  # Đọc trạng thái của ba người bạn cho mỗi bài toán
#         if a + b + c >= 2:                   # Nếu có ít nhất hai người chắc chắn
#             count += 1                       # Tăng biến đếm
#     print(count)  # In ra kết quả

# solve()



# cách 2 
n = int(input())
dem = 0
for _ in range(n):
    solve = input().split()
    if solve.count("1") >= 2 :
        dem +=1
print(dem)