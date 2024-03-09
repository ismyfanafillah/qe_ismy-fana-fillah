#!/bin/sh

echo "task start"

#create two folder
mkdir about_me
mkdir favorites

# create three files 
touch about_me.txt
touch foods.txt
touch drinks.txt

# move files 
mv about_me.txt ./about_me
mv foods.txt ./favorites
mv drinks.txt ./favorites

# fill the about_me.txt file with text
echo "Ismy Fana Fillah" > ./about_me/about_me.txt

# fill the foods.txt file with text
echo "Nasi Goreng" > ./favorites/foods.txt
echo "Bakso" >> ./favorites/foods.txt
echo "Mie" >> ./favorites/foods.txt

# fill the drinks.txt file with text
echo "Air Es" > ./favorites/drinks.txt
echo "Es Teh" >> ./favorites/drinks.txt
echo "Es Jeruk" >> ./favorites/drinks.txt

# show the content of the files
cat ./about_me/about_me.txt
cat ./favorites/foods.txt
cat ./favorites/drinks.txt

echo "task complete"

# display the contents of the directory in tree format
tree