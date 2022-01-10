import {ReactComponent as GithubIcon} from 'assets/img/github.svg'
import './styles.css';

function Navbar(){

    return(
        <header>
            <nav className='container'>
                <div className='app-ds-movies-nav-content'>
                    <h1>App-DS-Movies</h1>
                    <a href="https://github.com/celso1bueno1texeira/app-ds-moveies">
                        <div className='app-ds-movies-contactor-container'>
                            <GithubIcon />
                            <p className='app-ds-movies-contact-link'>/Celso Bueno</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    )
}
export default Navbar;