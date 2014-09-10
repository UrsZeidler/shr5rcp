#!/bin/bash

#new --- old
# races,lifestyle


while IFS=, read col1 col2
do   
	INPUT="platform:/resource/shr5Resource/shr5-1.shr5#$col2"
	SED_CMD="${SED_CMD}s@$INPUT@$col1@;" 
#echo "s@$INPUT@$col1@"
done < replace.txt

sed "${SED_CMD}" mm-test.xmi >test.xmi


