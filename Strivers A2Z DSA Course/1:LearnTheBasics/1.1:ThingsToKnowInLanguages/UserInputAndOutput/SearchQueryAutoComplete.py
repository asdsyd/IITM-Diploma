#User function Template for python3

class AutoCompleteSystem():
    def __init__(self, sentences, times):
    # write code for constructor

    def input(self,c):
        '''
            write code to return the top 3 suggestions when the current character in the stream is c
            c == '#' means , the current query is complete and you may save the entire query into
            historical data
        '''