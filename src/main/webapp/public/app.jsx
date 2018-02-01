const ARC_DE_TRIOMPHE_POSITION = {
    lat: 48.873947,
    lng: 2.295038
};

const EIFFEL_TOWER_POSITION = {
    lat: 48.858608,
    lng: 2.294471
};

class Map extends React.Component {



    componentDidMount() {

        this.map = new google.maps.Map(this.refs.map, {
            center: EIFFEL_TOWER_POSITION,
            zoom: 16
        });
        var marker1 = new google.maps.Marker({
            position: EIFFEL_TOWER_POSITION,
            map: this.map,
            title: 'Hello World!'
        });
        var marker2 = new google.maps.Marker({
            position: ARC_DE_TRIOMPHE_POSITION,
            map: this.map,
            title: 'Hello World!'
        });
    }

    render() {
        const mapStyle = {
            width: 1200,
            height: 900,
            border: '1px solid black'
        };

        return (
            <div ref="map" style={mapStyle}>I should be a map!</div>
        );
    }
}

ReactDOM.render(
    <Map />, document.getElementById('root')
);