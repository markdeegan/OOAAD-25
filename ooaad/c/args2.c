/* Mark Deegan */
/* Sun Oct  5 10:26:15 IST 2025 */
/* programme to start handling command-line arguments */

/* include declarations needed for the printf function */
#include <stdio.h>

/* the operating system supplies two pieces of data */
/* the first, argc, indicated the number of command-line arguments */
/* the second, argv[] is thet array of those command-line arguments */
int main(int argc, char** argv)
/* start definition of the main function */
{
	/* print the name of the executable programme */
	/* this is always contained in argv[0] */
	printf("The executable programm name is: %s\n", argv[0]);

		/* and tell us how many, if any arguments were supplied */
	if(argc ==1)
		printf("You did not supply any command-line arguments\n");

	/* and, if there were any arguments supplied */
	/* execute the following block */
	if (argc >1)
	{ /* block executed only if arguments were supplied */
		/* tell us how many arguments were supplied */
		printf("You supplied %d command-line arguments\n", (argc-1));
		
		/* tell us what they were */
		printf("They were: \n");
		/* by using a for loop to iterate through the */
		/* contents of the argv[] array of strings */
		for(int i=1; i< argc; i++) printf("\t%d: %s\n", i, argv[i]);
	} /* end the block that is executed if arguments were supplied*/

}
/* end definition of the main function */