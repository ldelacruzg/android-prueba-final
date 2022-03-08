# EXAMEN FINAL PRÁCTICO

http://www.geognos.com/api/en/countries/service_name/counry_code_or_ip.ouput_format 

service_name: Info o flag
counry_code_or_ip: ISO2 format name
ouput_format : json o png
 

1.- Implemente un Modelo Tensor Flow Lite que reconozca las banderas de países, usando el dataset adjunto a la tarea. El modelo deberá determinar el nombre del país en formato del "ISO 3166-1-alpha-2 character code" , el cual representa el parámetro necesario para la siguiente parte.

2.- Unavez identificado el país, mostrar la información, usando los Servicios Web: http://www.geognos.com/api/en/countries/info/{alpha2code}.json y http://www.geognos.com/api/en/countries/flag/{alpha2code}.png

Con los datos GeoReferenciales de la  ubicación del país y la capital, ubicar en el Map el país y marcar con un rectángulo en la parte inferior mostrar los datos mas importantes, como se muestra en la imagen de abajo

Resultados:

Identificando Belgica:

<img src="https://user-images.githubusercontent.com/68710846/157285711-6fa5c6a9-2b6d-401d-a79b-cdec40244bc5.png" height="600" />

Detalles de Belgica:

<img src="https://user-images.githubusercontent.com/68710846/157285583-65c68d76-4cc8-4d5e-b37a-f8913214f32e.png" height="600" />

Identificando México:

<img src="https://user-images.githubusercontent.com/68710846/157285939-b1f2b460-5870-4ba7-bb39-924f7cde6c08.png" height="600" />

Detalles de México:

<img src="https://user-images.githubusercontent.com/68710846/157285868-6f202914-e85d-4fd9-b768-68cdd49afcd8.png" height="600" />

Identificando Francia:

<img src="https://user-images.githubusercontent.com/68710846/157286182-7776cfa0-ba6a-4450-8270-7cbf5c45a6c8.png" height="600" />

Detalles de Francia:

<img src="https://user-images.githubusercontent.com/68710846/157286253-8fdddcf4-9c13-418c-bda0-111d1d32735a.png" height="600" />

