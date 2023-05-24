### Gaussian Blur Image

This is a Python code snippet that demonstrates how to apply a Gaussian blur effect to an image using the `PIL` (Pillow) library.

#### Dependencies

Make sure you have the `PIL` (Pillow) library installed before running this code. You can install it using the following command:

```shell
pip install Pillow
```

#### Usage

1. Import the necessary modules:

```python
from PIL import Image
```

2. Define the `gaussian_blur` function:

```python
def gaussian_blur(image, radius):
    width, height = image.size
    blurred_image = Image.new("RGB", (width, height))
  
    # Iterate over each pixel in the image
    for x in range(width):
        for y in range(height):
            r_total, g_total, b_total = 0, 0, 0
            count = 0
          
            # Iterate over a neighborhood of pixels
            for dx in range(-radius, radius + 1):
                for dy in range(-radius, radius + 1):
                    nx = x + dx
                    ny = y + dy
                  
                    # Check if the neighboring pixel is within the image boundaries
                    if 0 <= nx < width and 0 <= ny < height:
                        r, g, b = image.getpixel((nx, ny))
                        r_total += r
                        g_total += g
                        b_total += b
                        count += 1
          
            # Calculate the average color values for the neighborhood
            r_avg = r_total // count
            g_avg = g_total // count
            b_avg = b_total // count
          
            # Set the corresponding pixel in the blurred image
            blurred_image.putpixel((x, y), (r_avg, g_avg, b_avg))
  
    return blurred_image
```

3. Load the input image:

```python
image_path = "/path/to/input/image.jpg"
image = Image.open(image_path)
```

4. Define the blur radius:

```python
radius = 5
```

5. Apply the Gaussian blur to the image:

```python
blurred_image = gaussian_blur(image, radius)
```

6. Save the blurred image to an output file:

```python
output_path = "/path/to/output/blurred_image.jpg"
blurred_image.save(output_path)
```

Make sure to replace `/path/to/input/image.jpg` with the actual path to the input image file and `/path/to/output/blurred_image.jpg` with the desired path and filename for the output blurred image.

#### Description

The `gaussian_blur` function takes an input image and a blur radius as parameters and applies a Gaussian blur effect to the image. It uses nested loops to iterate over each pixel in the image and calculates the average color values of a neighborhood of pixels centered around each pixel. The resulting average color values are then assigned to the corresponding pixel in the blurred image. The size of the neighborhood is determined by the blur radius.

#### Example

In the provided code, an image is loaded from the file path `/Computer-Graphics/4-Blur_Image/car.jpeg`. The blur radius is set to 5. The `gaussian_blur` function is called with the image and blur radius, and the resulting blurred image is saved to the file path `/Computer-Graphics/4-Blur_Image/carro_blurred.jpg`.

Note: Please make sure to adjust the file paths according to your specific file locations when using the code.

Feel free to modify and experiment with the code to apply the Gaussian blur effect to different images or customize the blur radius as desired.
