#!/bin/bash

#new --- old
# races,lifestyle


while IFS=, read col1 col2
do   
	INPUT="$col2"
	OUT="$col1"
	SED_CMD="${SED_CMD}s@$INPUT@$OUT@;" 
#echo "s@$INPUT@$col1@"
done < replace.txt

sed "${SED_CMD}" test.xml >test-3.xml


