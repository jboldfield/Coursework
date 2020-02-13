{"filter":false,"title":"pundit.rb","tooltip":"/depot/config/initializers/pundit.rb","undoManager":{"mark":0,"position":0,"stack":[[{"start":{"row":0,"column":0},"end":{"row":21,"column":49},"action":"insert","lines":["module PunditHelper","  extend ActiveSupport::Concern","","  included do","    include Pundit","    rescue_from Pundit::NotAuthorizedError, with: :account_not_authorized","  end","","  private","","  def account_not_authorized","    respond_to do |format|","      format.html {","        redirect_to request.referrer || store_index_url, notice: \"Access denied.\"","      }","      format.json {render json: {\"redirect\":true, \"redirect_url\": store_index_url}}","    end","  end","","end","","ApplicationController.send :include, PunditHelper"],"id":1}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":14,"column":7},"end":{"row":14,"column":7},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1551738044484,"hash":"14a2d1653dfc68091a9e35678107f9edae76a6bb"}