import pandas as pd

dataBase = pd.read_excel('Server/result.xlsx')


dataBase.loc[-1] = ['jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho', 'jho']

print(dataBase)