import pandas

# Structure our data as a dictionary
data = {
  "usernames": ["admin", "Charles", "Deku"],
  "passwords": ["password", "Charl13", "AllMight"]
}
# Create a new DataFrame using the data
dataframe = pandas.DataFrame(data)

# Write the data to a csv file
dataframe.to_csv("Act17.csv")