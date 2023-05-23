from PIL import Image

def ajustar_brilho(caminho_imagem, fator):
    imagem = Image.open(caminho_imagem)

    pixels = imagem.load()

    largura, altura = imagem.size

    for i in range(largura):
        for j in range(altura):
    
            r, g, b = pixels[i, j]

    
            r = int(r * fator)
            g = int(g * fator)
            b = int(b * fator)

    
            pixels[i, j] = (r, g, b)

    caminho_imagem_ajustada = caminho_imagem.replace('.jpeg', '_ajustado.jpeg')
    imagem.save(caminho_imagem_ajustada)

    return caminho_imagem_ajustada

caminho_imagem = '/Computer-Graphics/7-Brightness_Adjustment/girafa.jpeg'
fator_brilho = 2.5
caminho_imagem_ajustada = ajustar_brilho(caminho_imagem, fator_brilho)
print("Caminho da imagem ajustada:", caminho_imagem_ajustada)
