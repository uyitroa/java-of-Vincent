name=$1
javac $name
length=$(( ${#name} - 5  ))
for (( i = 0 ; i < length ; i++ ))
do
	if [ $i -eq 0 ]
	then
		newname=${name:$i:1}
	else
		newname=$newname${name:$i:1}
	fi
done
java $newname
