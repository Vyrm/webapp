<%@include file="header.jsp"%>
<form class="form-horizontal" method = "post" action = "/addnewapartment"
      modelAttribute="apartment">
    <div class="form-group">
        <label class="control-label col-sm-2" for="city">City:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="city"  name="city" placeholder="Enter city">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="street">Street:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="street" name="street" placeholder="Enter street">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="roomCount">Count of rooms:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="roomCount" name="roomCount" placeholder="Enter room count">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="price">Price:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="price" name="price" placeholder="Enter price">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </div>
</form>
<%@include file="footer.jsp"%>
