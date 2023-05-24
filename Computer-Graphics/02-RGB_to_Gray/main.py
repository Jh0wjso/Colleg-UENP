from PIL import Image

def converter_para_tons_de_cinza(caminho_imagem):
    imagem = Image.open(caminho_imagem)

    imagem_cinza = imagem.convert('L')

    caminho_imagem_cinza = caminho_imagem.replace('.png', '_cinza.png')

    imagem_cinza.save(caminho_imagem_cinza)

    return caminho_imagem_cinza

caminho_imagem_colorida = '/Computer-Graphics/2-RGB_to_Gray/carro.jpg'
caminho_imagem_cinza = converter_para_tons_de_cinza(caminho_imagem_colorida)
print("Caminho da imagem em tons de cinza:", caminho_imagem_cinza)
