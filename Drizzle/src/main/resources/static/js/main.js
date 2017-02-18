$("input[maxlength]").each(function() {
    var $this = $(this);
    var maxLength = parseInt($this.attr('maxlength'));
    $this.attr('maxlength', null);
    
    var el = $("<span class=\"character-count\">" +"You have " + maxLength + " characters left." + "</span>");
    el.insertAfter($this);
    
    $this.bind('keyup', function() {
        var cc = $this.val().length;
        
        el.text(maxLength - cc);
        
        if(maxLength < cc) {
            el.css('color', 'red');
        } else {
            el.css('color', null);
        }
    });
});
