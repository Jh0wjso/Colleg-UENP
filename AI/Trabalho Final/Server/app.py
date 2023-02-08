import pandas as pd
from flask import Flask, redirect, render_template, request
from flask_cors import CORS
from sklearn.naive_bayes import GaussianNB
from sklearn.preprocessing import LabelEncoder
from sklearn.metrics import accuracy_score
import pickle
import numpy as np

app = Flask(__name__)

CORS(app)
cors = CORS(app, resources={
    r"/*": {
        "origins": "localhost"
    }
})

dataBase = pd.read_excel("dataBase.xlsx")

@app.route('/', methods=['GET'])
def home():
    return 'Server is Running'


def formatarDados(dataName, column):
    auxList = dataBase[f'{column}'].drop_duplicates()
    auxList = np.asarray(auxList)
    indexNum = 0
    for i in range(len(auxList)):
        if dataName == auxList[i]:
            indexNum = i

    return indexNum


def createModel():
    base = pd.read_excel("Server/dataBase.xlsx")
    X = base.iloc[:, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 22, 13, 14, 15, 16, 17, 18,
                      19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]].values
    y = base.iloc[:, 0].values
    labelEnconder = LabelEncoder()
    for i in range(35):
        X[:, i] = labelEnconder.fit_transform(X[:, i])
    modelo = GaussianNB()
    modelo.fit(X, y)


def returnScore():
    baseScore = pd.read_excel("dataBase.xlsx")
    X = baseScore.iloc[:, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 22, 13, 14, 15, 16, 17,
                           18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]].values
    y = baseScore.iloc[:, 0].values
    labelEnconder = LabelEncoder()
    for i in range(35):
        X[:, i] = labelEnconder.fit_transform(X[:, i])

    modeloScore = GaussianNB()
    modeloScore.fit(X, y)

    previsoes = modeloScore.predict(X)
    score = accuracy_score(y, previsoes)
    return score


@app.route('/result', methods=['POST'])
def getData():
    data = request.form.get('data')
    data2 = request.form.get('data2')
    data3 = request.form.get('data3')
    data4 = request.form.get('data4')
    data5 = request.form.get('data5')
    data6 = request.form.get('data6')
    data7 = request.form.get('data7')
    data8 = request.form.get('data8')
    data9 = request.form.get('data9')
    data10 = request.form.get('data10')
    data11 = request.form.get('data11')
    data12 = request.form.get('data12')
    data13 = request.form.get('data13')
    data14 = request.form.get('data14')
    data15 = request.form.get('data15')
    data16 = request.form.get('data16')
    data17 = request.form.get('data17')
    data18 = request.form.get('data18')
    data19 = request.form.get('data19')
    data20 = request.form.get('data20')
    data21 = request.form.get('data21')
    data22 = request.form.get('data22')
    data23 = request.form.get('data23')
    data24 = request.form.get('data24')
    data25 = request.form.get('data25')
    data26 = request.form.get('data26')
    data27 = request.form.get('data27')
    data28 = request.form.get('data28')
    data29 = request.form.get('data29')
    data30 = request.form.get('data30')
    data31 = request.form.get('data31')
    data32 = request.form.get('data32')
    data33 = request.form.get('data33')
    data34 = request.form.get('data34')
    data35 = request.form.get('data35')

    url = (
        'datas/' + str(data) + '/' + str(data2) + '/' +
        str(data3) + '/' + str(data4) + '/' + str(data5)
        + '/' + str(data6) + '/' + str(data7) + '/' +
        str(data8) + '/' + str(data9) + '/' + str(data10)
        + '/' + str(data11) + '/' + str(data12) + '/' +
        str(data13) + '/' + str(data14) + '/' + str(data15)
        + '/' + str(data16) + '/' + str(data17) + '/' +
        str(data18) + '/' + str(data19) + '/' + str(data20)
        + '/' + str(data21) + '/' + str(data22) + '/' +
        str(data23) + '/' + str(data24) + '/' + str(data25)
        + '/' + str(data26) + '/' + str(data27) + '/' +
        str(data28) + '/' + str(data29) + '/' + str(data30)
        + '/' + str(data31) + '/' + str(data32) + '/' +
        str(data33) + '/' + str(data34) + '/' + str(data35)
    )

    return redirect(url)

@app.route(
    '/datas/<data>/<data2>/<data3>/<data4>/<data5>/<data6>/<data7>/<data8>/<data9>/<data10>/<data11>/<data12>/<data13'
    '>/<data14>/<data15>/<data16>/<data17>/<data18>/<data19>/<data20>/<data21>/<data22>/<data23>/<data24>/<data25'
    '>/<data26>/<data27>/<data28>/<data29>/<data30>/<data31>/<data32>/<data33>/<data34>/<data35>/',
    methods=['GET'])
def showdata(data, data2, data3, data4, data5, data6, data7, data8, data9, data10, data11, data12, data13, data14,
             data15, data16, data17, data18, data19, data20, data21, data22, data23, data24, data25, data26, data27,
             data28, data29, data30, data31, data32, data33, data34, data35):

    # createModel()

    score = returnScore()
    score = round((score * 100), 2)
    naive_bayes = pickle.load(open('naivebayes_finalizado.sav', 'rb'))

    novo_registro = [[formatarDados(data, 'germination'), formatarDados(data2, 'fruit-pods'), formatarDados(data3, 'area-damaged'),
                      formatarDados(data4, 'canker-lesion'), formatarDados(data5, 'crop-hist')]]

    novo_registro = np.asarray(novo_registro)
    resposta = naive_bayes.predict(novo_registro)

    return ''' 
    <body style="background-color: #111010; display: flex; justify-content: center; font-family: 'Times New Roman', Times, serif;">
        <div style="color: #fff; display: flex; flex-direction: column; align-items: center;">
            <h1 style="font-weight: 700">Resultados:</h1>
            <h3 style="font-weight: 200">Porcentagem de Confiança {}% da IA</h3>
            <h3 style="font-weight: 200">Resultado Mais Provável: {}</h3>
        </div>
    </body>
    '''.format(score, resposta[0])

@app.route('/<string:nome>')
def error(nome):
    return '<h3> Página {} não encontrada </h3>'.format(nome)

app.run("0.0.0.0")
