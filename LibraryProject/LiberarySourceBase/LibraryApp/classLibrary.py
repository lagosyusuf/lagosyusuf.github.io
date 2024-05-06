# Library Class and its Method---Begins

class Library:
    
    def __init__(self, booksList, name): #Here, name is the library name
        self.booksList = booksList
        self.name = name
        self.lendDict = {}

    def displayBooks(self):
        print('We have following books in our library: ')
        for book in self.booksList:
            print(book)        

    def lendBooks(self, book, user):
        if book in booksList:
            if book not in self.lendDict.keys():
                self.lendDict.update({"book": user})
                print('Book has been lended. Database updated.')
            else:
                print(f'Book already been used by {self.lendDict[book]}')
        else:
            print("Apologies! We don't have this book in our library")
    
    def addBook(self, book, user):
        if book in booksList:
            print('Book already exists')
        else:
            self.bookList.append(book)
            bookDatabase = open(databaseName, 'a')
            bookDatabase.write('\n')
            bookDatabase.write(book)
            print('Book added')
            
    def returnBook(self, book):
        if book in self.lendDict.keys():
            self.lendDick.pop(book)
            print('Book returned successfully')
        else:
            print('Book does not exist in Book Lending Database')
            # Library Class and its Method---Ends