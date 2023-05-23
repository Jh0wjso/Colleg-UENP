from PIL import Image

def ajustar_contraste(imagem, fator):
    largura, altura = imagem.size
    pixels = imagem.load()

    for x in range(largura):
        for y in range(altura):
            r, g, b = pixels[x, y]

        
            r = int((r - 128) * fator + 128)
            g = int((g - 128) * fator + 128)
            b = int((b - 128) * fator + 128)

        
            r = max(0, min(255, r))
            g = max(0, min(255, g))
            b = max(0, min(255, b))

            pixels[x, y] = (r, g, b)

    return imagem


caminho_imagem = '/home/jhonatan/Documentos/UENP/Colleg-UENP/Computer-Graphics/8-Contrast_Adjustment/girafa.jpeg'
imagem = Image.open(caminho_imagem)

fator_contraste = 4.5 
imagem_ajustada = ajustar_contraste(imagem, fator_contraste)

caminho_imagem_ajustada = caminho_imagem.replace('.jpeg', '_ajustada.jpeg')
imagem_ajustada.save(caminho_imagem_ajustada)

print("Caminho da imagem ajustada:", caminho_imagem_ajustada)
