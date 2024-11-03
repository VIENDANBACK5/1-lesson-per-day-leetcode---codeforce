def solve(names):
  letter_counts = {}
  for name in names:
    first_letter = name[0]
    if first_letter in letter_counts:
      letter_counts[first_letter] += 1
    else:
      letter_counts[first_letter] = 1

  total_pairs = 0
  for count in letter_counts.values():
    total_pairs += count * (count - 1) // 2
  min_pairs = total_pairs // 2 

  return min_pairs

n = int(input())
names = [input() for _ in range(n)]
result = solve(names)
print(result)