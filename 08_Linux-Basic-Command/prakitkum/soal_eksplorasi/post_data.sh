#!/bin/bash

# Prompt the user for input
read -p "Enter post title: " title
read -p "Enter post body: " body
read -p "Enter user ID: " userId

# Construct JSON data
jsonBody="{\"title\":\"$title\",\"body\":\"$body\",\"userId\":$userId}"

# Use curl to send a POST request
response=$(curl -s -X POST -H "Content-Type: application/json" -d "$jsonBody" "https://jsonplaceholder.typicode.com/posts")

# Output the response
echo "sending request..."
echo "$response"
echo "done"
