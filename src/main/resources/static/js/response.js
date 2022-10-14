function blink()

{

    let body = document.querySelector(".name");

    if (body.style.visibility == 'hidden')

    {

        body.style.visibility = 'visible';

    }

    else

    {

        body.style.visibility = 'hidden';

    }

}



// Blinks

window.setInterval(blink, 1);