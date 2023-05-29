file = open("/usercode/files/books.txt", "r")
for line in file.readlines():
    print(f'{line[0]}{len(line.strip())}')
file.close()
