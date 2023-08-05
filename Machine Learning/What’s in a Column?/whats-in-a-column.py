import pandas as pd
import numpy as np

filename = input()
column_name = input()

df = pd.read_csv(filename)


df = pd.read_csv(filename) # read the file as a pandas dataframe
arr = np.array(df[column_name]) # transform the pretended column as a numpy array
print(arr) # show the value of the array
