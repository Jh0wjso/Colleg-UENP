from PIL import Image

def converter_para_preto_e_branco(caminho_imagem_cinza, limiar):
    imagem_cinza = Image.open(caminho_imagem_cinza)
    imagem_pb = imagem_cinza.point(lambda pixel: 0 if pixel < limiar else 255, '1')
    caminho_imagem_pb = caminho_imagem_cinza.replace('_cinza.png', '_pb.png')
    imagem_pb.save(caminho_imagem_pb)

    return caminho_imagem_pb

caminho_imagem_cinza = '/home/jhonatan/Documentos/UENP/CG/3/carroCinza.jpg'
limiar = 128
caminho_imagem_pb = converter_para_preto_e_branco(caminho_imagem_cinza, limiar)
print("Caminho da imagem em preto e branco:", caminho_imagem_pb)
