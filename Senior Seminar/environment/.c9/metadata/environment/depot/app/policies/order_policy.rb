{"filter":false,"title":"order_policy.rb","tooltip":"/depot/app/policies/order_policy.rb","undoManager":{"mark":0,"position":0,"stack":[[{"start":{"row":0,"column":0},"end":{"row":54,"column":3},"action":"insert","lines":["class OrderPolicy","  attr_reader :current_account, :model","","  def initialize(current_account, model)","    @current_account = current_account","    @order = model","  end","","  def index?","    if (@current_account) ","        current_account.accountable_type == \"Buyer\"","    else","        false","     end ","  end","","  def show?","    @order.buyer && @current_account == @order.buyer.account","  end","","  def new?","    if (@current_account) ","      @current_account.accountable_type == \"Buyer\"","    else","      true","    end","  end","","  def create?","    if (@current_account) ","      @current_account.accountable_type == \"Buyer\"","    else","      true","    end","  end","","  def edit?","    @current_account == @order.buyer.account ","  end","","  def update?","    @current_account == @order.buyer.account ","  end","","  def destroy?","    @current_account == @order.buyer.account ","  end","","  class Scope < Struct.new(:current_account, :model)","    def resolve","      model.where(buyer: current_account.accountable)","    end","  end","","end"],"id":1}]]},"ace":{"folds":[],"scrolltop":600.5,"scrollleft":0,"selection":{"start":{"row":50,"column":19},"end":{"row":50,"column":19},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1551815044246,"hash":"46a771044312dae76db117362b7b70731852cc4c"}