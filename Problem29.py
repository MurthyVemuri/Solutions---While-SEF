def compute(num):
	seen = set(a**b for a in range(2, num+1) for b in range(2, num+1))
	return str(len(seen))


if __name__ == "__main__":
	num = int(input())
	print(compute(num))
