let canciones = ['Típica Intro','Game Over','No Hay Huevos','Majestad Cuidado con la Gravedad','Dios del Balompié','Americano','Violenta Revolución','Festival','Leia','Fibergran','Orcos de Mordor','Hipihopo','Preludio al Dolor','Qué Dolor','Te das Queen','Mongomix'];

let duracionCanciones = ['2:07', '4:33', '4:26', '4:52', '4:05', '5:08', '5:21', '6:06', '6:13', '2:54', '4:57', '4:05', '1:25', '2:37', '5:35', '12:34'];

let rutaCanciones = ['audio/El Reno Renardo - 01 - Tipica Intro.mp3', 'audio/El Reno Renardo - 02 - Game Over.mp3','audio/El Reno Renardo - 03 - No Hay Huevos.mp3', 'audio/El Reno Renardo - 04 - Majestad Cuidado Con La Gravedad.mp3', 'audio/El Reno Renardo - 05 - Dios Del Balompie.mp3', 'audio/El Reno Renardo - 06 - Americano.mp3','audio/El Reno Renardo - 07 - Violenta Revolucion.mp3','audio/El Reno Renardo - 08 - Festival.mp3','audio/El Reno Renardo - 09 - Leia.mp3','audio/El Reno Renardo - 10 - Fibergran.mp3','audio/El Reno Renardo - 11 - Orcos De Mordor.mp3','audio/El Reno Renardo - 12 - Hipihopo.mp3','audio/El Reno Renardo - 13 - Preludio Al Dolor.mp3','audio/El Reno Renardo - 14 - Que Dolor.mp3','audio/El Reno Renardo - 15 - Te Das Queen.mp3','audio/El Reno Renardo - 16 - Mongomix.mp3'];

const trackList = document.getElementById('trackList');

canciones.forEach((cancion, i) => {

    /*trackList.innerHTML = trackList.innerHTML + `
    <tr class="song-row">
        <td class="index">${i+1}</td>
        <td>
            <p class="song-name">${cancion}</p>
            <p class="artist-name">El Reno Renardo</p>
        </td>
        <td class="duration">${duracionCanciones[i]}</td>
    </tr>`*/

    let fila = document.createElement('tr');
    fila.className = 'song-row';

    fila.addEventListener('click', function(event){
        let audioPlayer = document.getElementById('audio-player');
        let numCancion = parseInt(event.target.parentNode.firstChild.innerText)-1;
        audioPlayer.src = rutaCanciones[numCancion];
        audioPlayer.play();
    });

    let celdaIndex = document.createElement('td');
    celdaIndex.className = 'index';
    celdaIndex.innerText = i+1;

    let celdaCancionArtista = document.createElement('td');

    let parrafoCancion = document.createElement('p');
    parrafoCancion.className = 'song-name';
    parrafoCancion.innerText = cancion;

    let parrafoArtista = document.createElement('p');
    parrafoArtista.className = 'artist-name';
    parrafoArtista.innerText = 'El Reno Renardo';

    celdaCancionArtista.appendChild(parrafoCancion);
    celdaCancionArtista.appendChild(parrafoArtista)

    let celdaDuracion = document.createElement('td');
    celdaDuracion.className = 'duration';
    celdaDuracion.innerText = duracionCanciones[i];

    fila.appendChild(celdaIndex);
    fila.appendChild(celdaCancionArtista);
    fila.appendChild(celdaDuracion);

    trackList.appendChild(fila);

});


/*canciones.forEach(function(cancion,i){

});*/

