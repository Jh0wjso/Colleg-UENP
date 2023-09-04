import * as THREE from 'https://cdnjs.cloudflare.com/ajax/libs/three.js/r128/three.module.js';

        function main() {
            const canvas = document.querySelector('#c');
            const renderer = new THREE.WebGLRenderer({ canvas });
            canvas.style.display = 'block';
            renderer.setSize(window.innerWidth, window.innerHeight);
            const fov = 75;
            const aspect = window.innerWidth / window.innerHeight;
            const near = 0.1;
            const far = 5;
            const camera = new THREE.PerspectiveCamera(fov, aspect, near, far);
            camera.position.z = 2;
            const scene = new THREE.Scene();
            renderer.setClearColor(new THREE.Color(0xeeeeee));
            const objects = [];
            const redMaterial = new THREE.MeshBasicMaterial({ color: 0xff0000 });

            function addCube() {
                const cubeGeometry = new THREE.BoxGeometry(0.5, 0.5, 0.5);
                const cube = new THREE.Mesh(cubeGeometry, redMaterial);
                cube.position.x = Math.random() * 4 - 2;
                cube.position.y = Math.random() * 4 - 2;
                scene.add(cube);
                objects.push(cube);
            }

            function addSphere() {
                const sphereGeometry = new THREE.SphereGeometry(0.25, 16, 16);
                const sphere = new THREE.Mesh(sphereGeometry, redMaterial);
                sphere.position.x = Math.random() * 4 - 2;
                sphere.position.y = Math.random() * 4 - 2;
                scene.add(sphere);
                objects.push(sphere);
            }

            function addPyramid() {
                const pyramidGeometry = new THREE.ConeGeometry(0.5, 1, 4);
                const pyramid = new THREE.Mesh(pyramidGeometry, redMaterial);
                pyramid.position.x = Math.random() * 4 - 2;
                pyramid.position.y = Math.random() * 4 - 2;
                scene.add(pyramid);
                objects.push(pyramid);
            }

            function removeLastObject() {
                const lastObject = objects.pop();
                if (lastObject) {
                    scene.remove(lastObject);
                }
            }

            const addCubeButton = document.querySelector('#addCubeButton');
            addCubeButton.addEventListener('click', addCube);

            const addSphereButton = document.querySelector('#addSphereButton');
            addSphereButton.addEventListener('click', addSphere);

            const addPyramidButton = document.querySelector('#addPyramidButton');
            addPyramidButton.addEventListener('click', addPyramid);

            const removeButton = document.querySelector('#removeButton');
            removeButton.addEventListener('click', removeLastObject);

            function render(time) {
                time *= 0.001;
                objects.forEach(object => {
                    object.rotation.y = time;
                });
                renderer.render(scene, camera);
                requestAnimationFrame(render);
            }
            requestAnimationFrame(render);
        }

        main();