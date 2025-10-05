default:
	# this one is compiled without any optimzation flags
	gcc -o hello hello.c
	
	# this one is compiled withoptimzation flags
	gcc -Oz -s -o args1 args1.c
	
	# this one is compiled withoptimzation flags
	gcc -Oz -s -o args2 args2.c

clean:
	rm hello.exe args1.exe args2.exe

run_hello:
	./hello.exe

run_args1:
	clear
	@echo ----------
	./args1.exe
	@echo ----------
	./args1.exe hello
	@echo ----------
	./args1.exe hello mark
	@echo ----------
	@echo

run_args2:
	clear
	./args2.exe Hello Mark
