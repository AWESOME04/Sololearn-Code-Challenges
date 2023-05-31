import numpy as np

data = np.array([150000, 125000, 320000, 540000, 200000, 120000, 160000, 230000, 280000, 290000, 300000, 500000, 420000, 100000, 150000, 280000])

std = np.std(data)

mean = np.mean(data)

low = mean-std
high = mean+std
count = 0

for i in data:
    if low < i < high:
        count += 1

result = (count / len(data))*100

print(result)
