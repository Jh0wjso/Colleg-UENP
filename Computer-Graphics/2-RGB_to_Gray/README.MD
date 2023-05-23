## Converting an Image to Grayscale

The provided code demonstrates how to convert an image to grayscale using the Python Imaging Library (PIL) module.

```python
from PIL import Image

def convert_to_grayscale(image_path):
    # Open the image
    image = Image.open(image_path)

    # Convert the image to grayscale
    grayscale_image = image.convert('L')

    # Create the path for the grayscale image
    grayscale_image_path = image_path.replace('.png', '_grayscale.png')

    # Save the grayscale image
    grayscale_image.save(grayscale_image_path)

    return grayscale_image_path

# Path to the colored image
colored_image_path = '/Computer-Graphics/2-RGB_to_Gray/carro.jpg'

# Convert the image to grayscale
grayscale_image_path = convert_to_grayscale(colored_image_path)

print("Path of the grayscale image:", grayscale_image_path)
```

### Explanation

1. The code begins by importing the necessary `Image` class from the `PIL` module.
2. The `convert_to_grayscale` function is defined, which takes the `image_path` as input.
3. The function opens the image using the `Image.open` method and assigns it to the `image` variable.
4. The `convert` method is called on the `image` object with the argument `'L'`, which stands for grayscale conversion. This creates a new image object, `grayscale_image`, that represents the converted grayscale version of the original image.
5. The path for the grayscale image is created by replacing the file extension in the original `image_path` using the `replace` method. The resulting path is stored in `grayscale_image_path`.
6. The grayscale image is saved using the `save` method of the `grayscale_image` object, with the `grayscale_image_path` as the output file.
7. Finally, the function returns the path to the grayscale image.
8. The code then defines the `colored_image_path` variable with the path to the colored image.
9. The `convert_to_grayscale` function is called with the `colored_image_path` as the argument, and the return value (path to the grayscale image) is assigned to the `grayscale_image_path` variable.
10. The path of the grayscale image is printed to the console.

The code utilizes the `Image` class from the `PIL` module to open the colored image and convert it to grayscale. The grayscale image is then saved with a new filename, and the path of the grayscale image is returned for further use. This allows you to easily convert colored images to grayscale using the provided function.
