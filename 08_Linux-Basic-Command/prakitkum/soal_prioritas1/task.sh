#!/bin/sh

echo "task start"

#create two folder
mkdir first_folder
mkdir second_folder

# create two files
touch first_file.txt
touch second_file.txt

# move two files 
mv first_file.txt ./first_folder
mv second_file.txt ./second_folder

# fill two files with random text
echo "this is first file" > ./first_folder/first_file.txt
echo "this is second file" > ./second_folder/second_file.txt

# show the content of the files
cat ./first_folder/first_file.txt
cat ./second_folder/second_file.txt

echo "task complete"