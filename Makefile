build:
	javac -cp .. *.java

run:
	java MyApartment

all:
	javac -cp .. *.java
	java MyApartment

clean:
	rm -f *.class
