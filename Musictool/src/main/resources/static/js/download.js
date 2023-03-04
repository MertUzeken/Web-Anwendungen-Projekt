const playButton = document.querySelector('#dwn-btn');

downloadButton.addEventListener('click', () => {

  const downloadJsonFile = (data, filename) => {
    const blob = new Blob([JSON.stringify(data)], { type: 'application/json' });
    const url = URL.createObjectURL(blob);
    const link = document.createElement('a');
    link.href = url;
    link.download = filename;
    link.click();
    URL.revokeObjectURL(url);
  };
  
  downloadJsonFile(jsonData, document.getElementById("projectName").value+'.json');
});

