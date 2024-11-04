for _ in range(int(input())):
    s = input()
    l = len(s) - 2
    print([s, s[0] + str(l) + s[-1]][l>8]) # nếu l>8 (độ dài chuỗi > 10) thì chả về True (tức là 1) sẽ in ra phần tử thứ 1 trong dsach or ngược lại

