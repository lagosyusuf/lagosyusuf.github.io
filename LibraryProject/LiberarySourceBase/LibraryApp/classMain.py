from classLibrary import Library
import LibProgExec

def main():
    while(True):
        print(f'Welcome to the {library.name} library. Following are the options,')
        
        choice = '''
        1. Display Books
        2. lend a Book
        3. Add a Book
        4. Return a book
        '''
        
        print(choice)
        
        userInput = input('Press Q to Quite an C to continue:')
        if userInput == 'C':
            userChoice = int(input('Select an option to continue'))
            if userChoice == 1:
                Library.displayBooks()
            elif userChoice ==2:
                book = input('Enter the name of the book you want to lend:')
                user = input('Enter the name of the user:')
                Library.lendBook(book, user)
            elif userChoice == 3:
                book = input('Enter the name of the book you want to add:')
                Library.addBook(book)
            elif userChoice == 4:
                book = input('Enter the name of the book you want to return:')
                Library.returnBook(book)
            else:
                print('please choose a valid option')
        elif userChoice == 'Q':
            break
        else:
            print('Please enter a valid option')
# Main Function - Accepting User Input---Ends
                