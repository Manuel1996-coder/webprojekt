var textarea = $('textarea');
    speed = 80; //Writing speed in milliseconds
    text='Hallo wir sind cool.';

function writeText(text){
  textarea.text(
      textarea.text() + text[$('#textarea').text().length]
  );
  
  if(textarea.text().length == text.length){
    clearInterval(timeout);
  }
}

var timeout = setInterval('writeText(text)', speed);