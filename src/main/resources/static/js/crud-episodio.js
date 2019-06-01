function editEpisodio(url) {
	$.get(url, function(entity, status){
		$('#id').val(entity.id);
		$('#nome').val(entity.nome);
		$('#nota').val(entity.nota);
		$('#resumo').val(entity.resumo);
		$('#numero').val(entity.numero);
		$('#temporada').val(entity.temporada);
		$('#serie').val(entity.serie.id);
		$('#dataExibicao').val( formatDate(entity.dataExibicao) );

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

