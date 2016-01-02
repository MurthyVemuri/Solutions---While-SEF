def compute(m):
	ans = 1 
	ans = 4*(m ** 3) + 3*(m ** 2) + 8*m - 9;
	return str(ans/6)	


if __name__ == "__main__":
    count = int(input())
    for i in range(count):
        size = int(input())
        print(compute(size))
