# Program execution will begin from here using the __name__condition
from classLibrary import *
from classMain import *


if __name__ == '__main__':
    booksList = []
    databaseName = input('Enter the name of the database file with extension:')
    bookDatabase = open(databaseName, 'r')
    for book in bookDatabase:
        booksList.append(book)
    library = Library(booksList, 'PythonX')
    main()  # Jump to Main Function to accept user input