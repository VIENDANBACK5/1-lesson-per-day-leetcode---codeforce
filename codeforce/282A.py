x = 0  # Khởi tạo giá trị của x là 0

for _ in range(int(input())):
    n = input().strip()  # Đọc từng câu lệnh
    if "++" in n:
        x += 1
    elif "--" in n:
        x -= 1

print(x)  # In ra giá trị cuối cùng của x
