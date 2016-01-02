import sys
if sys.version_info.major == 2:
	range = xrange


def compute(num):
	ans = sum(i for i in range(2, 10 ** num) if i == fifth_power_digit_sum(i))
	return str(ans)


def fifth_power_digit_sum(n):
	return sum([int(c)**4 for c in str(n)])


if __name__ == "__main__":
	num = int(input())
	print(compute(num))
