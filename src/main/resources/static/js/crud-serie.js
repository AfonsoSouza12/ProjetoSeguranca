function editSerie(url) {
	$.get(url, function(entity, status){
		$('#id').val(entity.id);
		$('#nome').val(entity.nome);
		$('#nota').val(entity.nota);
		$('#resumo').val(entity.resumo);
		$('#genero').val(entity.genero.id);
		$('#produtora').val(entity.produtora.id);
		
		$('#dataEstreia').val( formatDate(entity.dataEstreia) );
		if (entity.dataEncerramento)
			$('#dataEncerramento').val( formatDate(entity.dataEncerramento) );
	});
	$('#modal-form').modal();
}

function formatDate(inputFormat){
	function pad(s){
		return (s < 10) ? '0' + s : s;
	}
	var d = new Date(inputFormat);
	return [ pad(d.getDate()), pad(d.getMonth()+1), d.getFullYear() ].join('/');
}


function saveUpload(urlDestino){
	var formData = new FormData($('#frm')[0]);
	$.ajax({
		type: $('#frm').attr('method'),
		 url: $('#frm').attr('action'),
		data: formData,
		async: false,
		cache: false,
		contentType: false,
		processData: false,
		success: function(){
			swal('Salvo!', 'Registro salvo com sucesso!', 'success');
			window.location = urlDestino;
		},
		error: function(){
			swal('Errou!', 'Falha ao salvar o registro!', 'error');
		}
	});//Fim Ajax
}