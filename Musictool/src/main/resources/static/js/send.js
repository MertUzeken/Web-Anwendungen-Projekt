function sendData() {
	// Get the page content as an object
	const pageContent = {
	  title: document.querySelector('title').textContent,
	  heading: document.querySelector('h1').textContent,
	  paragraph: document.querySelector('p').textContent
	};
  
	// Convert the object to a JSON string
	const jsonContent = JSON.stringify(pageContent);
  
	// Send the JSON string to the server
	fetch('/send-json', {
	  method: 'POST',
	  body: jsonContent,
	  headers: {
		'Content-Type': 'application/json'
	  }
	});
  }
  