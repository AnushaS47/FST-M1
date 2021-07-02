import pandas
dataframe = pandas.read_csv('Act17.csv')
print("full data")
print(dataframe)
print("================================")
print("usernames are:")
print(dataframe["usernames"])
print("================================")
print("Username: ", dataframe["usernames"][1], " | ", "Password: ", dataframe["passwords"][1])
print("usernames colunm in asceding order")
print(dataframe.sort_values("usernames"))
print("passwords in desceding order")
print(dataframe.sort_values("passwords",ascending=False))


